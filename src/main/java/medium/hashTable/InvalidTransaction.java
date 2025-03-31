package medium.hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvalidTransaction {
    public List<String> invalidTransactions(String[] transactions) {
        Map<String, List<Transaction>> mapValues = new HashMap<>();

        for(String transaction: transactions){
            Transaction transaction1 = new Transaction(transaction);
            if(!mapValues.containsKey(transaction1.name)){
                mapValues.put(transaction1.name, new ArrayList<>());
            }

            mapValues.get(transaction1.name).add(transaction1);
        }

        List<String> invalid = new ArrayList<>();
        for(String transaction: transactions){
            if(!isValid(new Transaction(transaction), mapValues)){
                invalid.add(transaction);
            }
        }

        return invalid;
    }

    private boolean isValid(Transaction transaction, Map<String, List<Transaction>> mapValues){
        if(transaction.amount >1000){
            return false;
        }

        for(Transaction transaction1 : mapValues.get(transaction.name)){
            if(!transaction.city.equals(transaction1.city) && Math.abs(transaction1.time-transaction.time) <= 60){
                return false;
            }
        }

        return true;
    }

   public class Transaction{
        String name;
        Integer time;
        Integer amount;
        String city;

        public Transaction(String transaction){
            String[] values = transaction.split(",");
            this.name = values[0];
            this.time = Integer.parseInt(values[1]);
            this.amount = Integer.parseInt(values[2]);
            this.city = values[3];
        }
   }
}

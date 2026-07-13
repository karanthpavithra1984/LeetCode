package medium.Array;

public class PushDominoes {
    public String pushDominoes(String dominoes) {
        int MAX_FORCE = dominoes.length();
        int[] forces = new int[MAX_FORCE];
        int force = 0;

        for(int i=0; i < MAX_FORCE; i++){

            //Lets right sweep first
            if(dominoes.charAt(i) == 'R'){
                force = MAX_FORCE; //All the dominos on the right will fail, hence MAX_FORCE
            }else if(dominoes.charAt(i) == 'L'){
                force = 0; //It will stop the fall
            }else{
                force = Math.max(force - 1, 0); //Force is either 0 or decays
            }

            forces[i] += force;
        }

        for(int i=MAX_FORCE-1; i >= 0; i--){

            //Lets right sweep first
            if(dominoes.charAt(i) =='L'){
                force = MAX_FORCE; //All the dominos on the left will fail, hence MAX_FORCE
            }else if(dominoes.charAt(i) == 'R'){
                force = 0; //It will stop the fall
            }else{
                force = Math.max(force - 1, 0); //Force is either 0 or decays
            }

            //Substract , because the force need to be calculated
            forces[i] -= force;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < forces.length; i++){
            if(forces[i] > 0 ){
                stringBuilder.append('R');
            }else if(forces[i] < 0){
                stringBuilder.append('L');
            }else{
                stringBuilder.append('.');
            }
        }

        return stringBuilder.toString();

    }
}

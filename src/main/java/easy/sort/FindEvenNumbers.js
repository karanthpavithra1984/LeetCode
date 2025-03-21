let findEvenNumbers = function (digits) {
    let countDigits = new Array(10).fill(0);

    for (let digit of digits) {
        countDigits[digit]++;
    }

    let res = [];

    for (let i = 100; i < 1000; i += 2) {
        let oneDigit = i % 10;
        let number = Math.floor(i / 10);
        let twoDigit = number % 10;
        number = Math.floor(number / 10);
        let threeDigit = number % 10;

        countDigits[oneDigit]--;
        countDigits[twoDigit]--;
        countDigits[threeDigit]--;

        if (countDigits[oneDigit] > -1 && countDigits[twoDigit] > -1 && countDigits[threeDigit] > -1) {
            res.push(i);
        }

        countDigits[oneDigit]++;
        countDigits[twoDigit]++;
        countDigits[threeDigit]++;

    }

    return res;
};
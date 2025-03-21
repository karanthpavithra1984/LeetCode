let minimumCost = function (cost) {
    let maxCost = Math.max(...cost);
    let costCounter = new Array(maxCost + 1).fill(0);

    for (let cos of cost) {
        costCounter[cos]++;
    }

    let counter = 0;
    let total = 0;
    for (let count = costCounter.length; count > 0; count--) {
        while (costCounter[count] > 0) {
            costCounter[count]--;
            if (counter % 3 == 2) {
                counter++;
                continue;
            }
            total += count;
            counter++;
        }
    }

    return total;
};
var fixedPoint = function(arr) {
    let left = 0, right = arr.length - 1;

    let answer = -1;

    while(left <= right){
        let middle = Math.floor((left+ right)/2)

        if(arr[middle] == middle){
            answer = middle;
            right = middle-1;
        }else if(arr[middle] < middle){
            left = middle+1;
        }else{
            right = middle-1;
        }
    }

    return answer
};
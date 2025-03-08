var flat = function (arr, n) {
    let hasNestedArray = false;
    let queue;
    let depth = 0;

    while(depth < n){
        hasNestedArray = false;
        queue = [];

        for(let i=0; i < arr.length; i++){
            if(Array.isArray(arr[i])){
                queue.push(...arr[i]);
                hasNestedArray = true;
            }else{
                queue.push(arr[i]);
            }
        }

        arr = [...queue];
        if(!hasNestedArray){
            break;
        }
        depth++;
    }

    return arr;
};
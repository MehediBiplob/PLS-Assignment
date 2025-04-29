function fixedHeapDynamicJS() {
    let heapArray = new Array(5);
    for (let i = 0; i < heapArray.length; i++) {
        heapArray[i] = i * 10;
    }
    console.log(heapArray);
}
fixedHeapDynamicJS();
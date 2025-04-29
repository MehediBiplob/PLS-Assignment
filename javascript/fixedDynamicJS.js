function fixedDynamicJS() {
    const numbers = new Array(5);
    for (let i = 0; i < numbers.length; i++) {
        numbers[i] = i * 2;
    }
    console.log(numbers);
}
fixedDynamicJS();
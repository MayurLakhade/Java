// For Loop
console.log("For Loop:");
for (let i = 1; i <= 5; i++) {
    console.log(i);
}

// For-In Loop (iterating over an array)
console.log("\nFor-In Loop:");
const colors = ['red', 'green', 'blue'];
for (let index in colors) {
    console.log(colors[index]);
}

// While Loop
console.log("\nWhile Loop:");
let count = 1;
while (count <= 5) {
    console.log(count);
    count++;
}

// Do-While Loop
console.log("\nDo-While Loop:");
let num = 1;
do {
    console.log(num);
    num++;
} while (num <= 5);
//1. 기본 함수

function mul(a ,b) {
    return a * b;
}
console.log(mul(5,7));

//2. 조건 함수

function grade(score) {
    if (score > 90) {
        return "A";
    }
    else {
        return "B";
    }
}
console.log(grade(85));
console.log(grade(95));

//3. true or false

function isEven(num) {
    return num % 3 === 0;
}
console.log(isEven(9));
console.log(isEven(8));

const grade = (score) => {

    if (score >= 90) return "A";
    if (score < 90 && score >= 80) return "B";
    if (score < 80 && score >= 70) return "C";
    if (score < 70 && score >= 60) return "D";
    else return "F";
}

console.log(grade(95));
console.log(grade(87));
console.log(grade(73));
console.log(grade(63));
console.log(grade(45));
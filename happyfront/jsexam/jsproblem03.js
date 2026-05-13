const student = {
    name : "이상민",
    age : 29,
    grade : 4,
    subject : ["science" , "math" , "history"]
};

console.log(student.name);

student.age++;
console.log(student.age);

student.subject.push("english");
console.log(student.subject);

console.log(student);

const number = [1,2,3,4,5];

const sum = number.reduce((acc , cur) => acc + cur,0);
console.log(sum);

const two = number.map(num => num *2);
console.log(two);

const fill = number.filter(num => num % 2 === 0);
console.log(fill);

number.forEach(num => console.log(num * 2));

const fe = number.forEach(num => num *2);
console.log(fe);



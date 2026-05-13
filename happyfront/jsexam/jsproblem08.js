const library = [
  { title: "aaaaa", author: "author1", year: 2026, isAvailable: true },
  { title: "bbbbb", author: "author2", year: 2025, isAvailable: false }
];

const searchBook = (title) => library.find(book => book.title === title);

const showAvailableBooks = () => {
  const available = library.filter(book => book.isAvailable).map(book => book.title);
  console.log("대여 가능 도서:", available);
};

const addBook = (title, author, year) => {
  library.push({ title, author, year, isAvailable: true });
};

addBook("ccccc", "author3", 2025);
showAvailableBooks();
CREATE TABLE Authors ( 
	author_id int PRIMARY KEY, 
	name CHAR(25), 
	fname CHAR(25)
);

CREATE TABLE Publishers ( 
	publisher_id int PRIMARY KEY, 
	name CHAR(30), 
	url CHAR(80) 
);

CREATE TABLE Books ( 
	title CHAR(60), 
	isbn CHAR(13) PRIMARY KEY,
 	publisher_id INT, 
	price DECIMAL(10,2), 
	constraint FKpublisher FOREIGN KEY (publisher_id) REFERENCES Publishers (publisher_id)
 );

CREATE TABLE BooksAuthors ( 
	isbn CHAR(13), 
	author_id INT, 
	seq_no INT, 
	constraint FKisbn FOREIGN KEY (isbn) REFERENCES Books (isbn), 
	constraint fkauthor FOREIGN KEY (author_id) REFERENCES Authors (author_id), 
	PRIMARY KEY (isbn, author_id) 
);

INSERT INTO Authors VALUES ('5698', 'Alexander', 'Christopher');
INSERT INTO Authors VALUES ('6299', 'Brooks', 'Frederick P.');
INSERT INTO Authors VALUES ('7927', 'Cormen', 'Thomas H.');
INSERT INTO Authors VALUES ('8549', 'Date', 'C. J.');
INSERT INTO Authors VALUES ('8527', 'Darwen', 'Hugh');
INSERT INTO Authors VALUES ('0938', 'Feiner', 'Steven K.');
INSERT INTO Authors VALUES ('0658', 'Flanagan', 'David');
INSERT INTO Authors VALUES ('0969', 'Foley', 'James D.');
INSERT INTO Authors VALUES ('1577', 'Gamma', 'Erich');
INSERT INTO Authors VALUES ('1520', 'Garfinkel', 'Simson');
INSERT INTO Authors VALUES ('2938', 'Hein', 'Trent R.');
INSERT INTO Authors VALUES ('2967', 'Helm', 'Richard');
INSERT INTO Authors VALUES ('2907', 'Hopcroft', 'John E.');
INSERT INTO Authors VALUES ('2512', 'Hughes', 'John F.');
INSERT INTO Authors VALUES ('3323', 'Ishikawa', 'Sara');
INSERT INTO Authors VALUES ('4928', 'Johnson', 'Ralph');
INSERT INTO Authors VALUES ('5528', 'Kahn', 'David');
INSERT INTO Authors VALUES ('5928', 'Kernighan', 'Brian');
INSERT INTO Authors VALUES ('5388', 'Kidder', 'Tracy');
INSERT INTO Authors VALUES ('5854', 'Knuth', 'Donald E.');
INSERT INTO Authors VALUES ('6933', 'Leiserson', 'Charles E.');
INSERT INTO Authors VALUES ('7947', 'Motwani', 'Rajeev');
INSERT INTO Authors VALUES ('8979', 'Nemeth', 'Evi');
INSERT INTO Authors VALUES ('2597', 'Raymond', 'Eric');
INSERT INTO Authors VALUES ('2347', 'Ritchie', 'Dennis');
INSERT INTO Authors VALUES ('2369', 'Rivest', 'Ronald R.');
INSERT INTO Authors VALUES ('3728', 'Schneier', 'Bruce');
INSERT INTO Authors VALUES ('3996', 'Seebass', 'Scott');
INSERT INTO Authors VALUES ('3366', 'Silverstein', 'Murray');
INSERT INTO Authors VALUES ('3898', 'Snyder', 'Garth');
INSERT INTO Authors VALUES ('3493', 'Stein', 'Clifford E.');
INSERT INTO Authors VALUES ('3496', 'Stoll', 'Clifford');
INSERT INTO Authors VALUES ('3425', 'Strassmann', 'Steven');
INSERT INTO Authors VALUES ('3429', 'Stroustrup', 'Bjarne');
INSERT INTO Authors VALUES ('5667', 'Ullman', 'Jeffrey D.');
INSERT INTO Authors VALUES ('6588', 'van Dam', 'Andries');
INSERT INTO Authors VALUES ('6633', 'Vlissides', 'John');
INSERT INTO Authors VALUES ('7933', 'Weise', 'Daniel');

INSERT INTO Publishers VALUES ('0201', 'Addison-Wesley', 'www.aw-bc.com');
INSERT INTO Publishers VALUES ('0471', 'John Wiley & Sons', 'www.wiley.com');
INSERT INTO Publishers VALUES ('0262', 'MIT Press', 'mitpress.mit.edu');
INSERT INTO Publishers VALUES ('0596', 'O''Reilly', 'www.ora.com');
INSERT INTO Publishers VALUES ('019', 'Oxford University Press', 'www.oup.co.uk');
INSERT INTO Publishers VALUES ('013', 'Prentice Hall', 'www.phptr.com');
INSERT INTO Publishers VALUES ('0679', 'Random House', 'www.randomhouse.com');
INSERT INTO Publishers VALUES ('07434', 'Simon & Schuster', 'www.simonsays.com');

INSERT INTO Books VALUES ('A Guide to the SQL Standard', '0-201-96426-0', '0201', 47.95);
INSERT INTO Books VALUES ('A Pattern Language: Towns, Buildings, Construction', '0-19-501919-9', '019', 65.00);
INSERT INTO Books VALUES ('Applied Cryptography', '0-471-11709-9', '0471', 60.00);
INSERT INTO Books VALUES ('Computer Graphics: Principles and Practice', '0-201-84840-6', '0201', 79.99);
INSERT INTO Books VALUES ('Cuckoo''s Egg', '0-7434-1146-3', '07434', 13.95);
INSERT INTO Books VALUES ('Design Patterns', '0-201-63361-2', '0201', 54.99);
INSERT INTO Books VALUES ('Introduction to Algorithms', '0-262-03293-7', '0262', 80.00);
INSERT INTO Books VALUES ('Introduction to Automata Theory, Languages, and Computation', '0-201-44124-1', '0201', 105.00);
INSERT INTO Books VALUES ('JavaScript: The Definitive Guide', '0-596-00048-0', '0596', 44.95);
INSERT INTO Books VALUES ('The Art of Computer Programming vol. 1', '0-201-89683-4', '0201', 59.99);
INSERT INTO Books VALUES ('The Art of Computer Programming vol. 2', '0-201-89684-2', '0201', 59.99);
INSERT INTO Books VALUES ('The Art of Computer Programming vol. 3', '0-201-89685-0', '0201', 59.99);
INSERT INTO Books VALUES ('The C Programming Language', '0-13-110362-8', '013', 42.00);
INSERT INTO Books VALUES ('The C++ Programming Language', '0-201-70073-5', '0201', 64.99);
INSERT INTO Books VALUES ('The Cathedral and the Bazaar', '0-596-00108-8', '0596', 16.95);
INSERT INTO Books VALUES ('The Codebreakers', '0-684-83130-9', '07434', 70.00);
INSERT INTO Books VALUES ('The Mythical Man-Month', '0-201-83595-9', '0201', 29.95);
INSERT INTO Books VALUES ('The Soul of a New Machine', '0-679-60261-5', '0679', 18.95);
INSERT INTO Books VALUES ('The UNIX Hater''s Handbook', '1-56884-203-1', '0471', 16.95);
INSERT INTO Books VALUES ('UNIX System Administration Handbook', '0-13-020601-6', '013', 68.00);

INSERT INTO BooksAuthors VALUES ('0-201-96426-0', '8549', 1);
INSERT INTO BooksAuthors VALUES ('0-201-96426-0', '8527', 2);
INSERT INTO BooksAuthors VALUES ('0-19-501919-9', '5698', 1);
INSERT INTO BooksAuthors VALUES ('0-19-501919-9', '3323', 2);
INSERT INTO BooksAuthors VALUES ('0-19-501919-9', '3366', 3);
INSERT INTO BooksAuthors VALUES ('0-471-11709-9', '3728', 1);
INSERT INTO BooksAuthors VALUES ('0-201-84840-6', '0969', 1);
INSERT INTO BooksAuthors VALUES ('0-201-84840-6', '6588', 2);
INSERT INTO BooksAuthors VALUES ('0-201-84840-6', '0938', 3);
INSERT INTO BooksAuthors VALUES ('0-201-84840-6', '2512', 4);
INSERT INTO BooksAuthors VALUES ('0-7434-1146-3', '3496', 1);
INSERT INTO BooksAuthors VALUES ('0-201-63361-2', '1577', 1);
INSERT INTO BooksAuthors VALUES ('0-201-63361-2', '2967', 2);
INSERT INTO BooksAuthors VALUES ('0-201-63361-2', '4928', 3);
INSERT INTO BooksAuthors VALUES ('0-201-63361-2', '6633', 4);
INSERT INTO BooksAuthors VALUES ('0-262-03293-7', '7927', 1);
INSERT INTO BooksAuthors VALUES ('0-262-03293-7', '6933', 2);
INSERT INTO BooksAuthors VALUES ('0-262-03293-7', '2369', 3);
INSERT INTO BooksAuthors VALUES ('0-262-03293-7', '3493', 4);
INSERT INTO BooksAuthors VALUES ('0-201-44124-1', '2907', 1);
INSERT INTO BooksAuthors VALUES ('0-201-44124-1', '5667', 2);
INSERT INTO BooksAuthors VALUES ('0-201-44124-1', '7947', 3);
INSERT INTO BooksAuthors VALUES ('0-596-00048-0', '0658', 1);
INSERT INTO BooksAuthors VALUES ('0-201-89683-4', '5854', 1);
INSERT INTO BooksAuthors VALUES ('0-201-89684-2', '5854', 1);
INSERT INTO BooksAuthors VALUES ('0-201-89685-0', '5854', 1);
INSERT INTO BooksAuthors VALUES ('0-13-110362-8', '5928', 1);
INSERT INTO BooksAuthors VALUES ('0-13-110362-8', '2347', 2);
INSERT INTO BooksAuthors VALUES ('0-201-70073-5', '3429', 1);
INSERT INTO BooksAuthors VALUES ('0-596-00108-8', '2597', 1);
INSERT INTO BooksAuthors VALUES ('0-684-83130-9', '5528', 1);
INSERT INTO BooksAuthors VALUES ('0-201-83595-9', '6299', 1);
INSERT INTO BooksAuthors VALUES ('0-679-60261-5', '5388', 1);
INSERT INTO BooksAuthors VALUES ('1-56884-203-1', '1520', 1);
INSERT INTO BooksAuthors VALUES ('1-56884-203-1', '7933', 2);
INSERT INTO BooksAuthors VALUES ('1-56884-203-1', '3425', 3);
INSERT INTO BooksAuthors VALUES ('0-13-020601-6', '8979', 1);
INSERT INTO BooksAuthors VALUES ('0-13-020601-6', '3898', 2);
INSERT INTO BooksAuthors VALUES ('0-13-020601-6', '3996', 3);
INSERT INTO BooksAuthors VALUES ('0-13-020601-6', '2938', 4);

INSERT into POST (id, title, content, author) VALUES (1, 'MIU','Life is structured in layers','Dean');
INSERT into POST (id, title, content, author) VALUES (2, 'React','React is a good SPA library','Dean');
INSERT into POST (id, title, content, author) VALUES (3, 'Spring','Spring is awesome','Dean');
INSERT into POST (id, title, content, author)  VALUES (4, 'SpringBoot','This is a module that works over spring modules','John');
INSERT into POST (id, title, content, author) VALUES (5, 'fifth','Spring is awesome','Bob');
INSERT into POST (id, title, content, author) VALUES (6, 'sixth','Spring is awesome','Bob');


INSERT into USERS (id, name) VALUES (1, 'Rame');
INSERT into USERS (id, name) VALUES (2, 'John');
INSERT into USERS (id, name) VALUES (3, 'Bob');
INSERT into USERS (id, name) VALUES (4, 'Bob1');

INSERT into USER_POSTS (USER_ID, POSTS_ID) VALUES (1, 1);
INSERT into USER_POSTS (USER_ID, POSTS_ID) VALUES (2, 2);
INSERT into USER_POSTS (USER_ID, POSTS_ID) VALUES (3, 3);
INSERT into USER_POSTS (USER_ID, POSTS_ID) VALUES (4, 4);
INSERT into USER_POSTS (USER_ID, POSTS_ID) VALUES (1, 5);
INSERT into USER_POSTS (USER_ID, POSTS_ID) VALUES (1, 6);
--
-- INSERT into USERS_POSTS  (USER_ID, POSTS_ID) VALUES (1, 1);
-- INSERT into USERS_POSTS  (USER_ID, POSTS_ID) VALUES (2, 2);
-- INSERT into USERS_POSTS  (USER_ID, POSTS_ID) VALUES (3, 3);
-- INSERT into USERS_POSTS  (USER_ID, POSTS_ID) VALUES (4, 4);
-- INSERT into USERS_POSTS  (USER_ID, POSTS_ID) VALUES (1, 5);
-- INSERT into USERS_POSTS  (USER_ID, POSTS_ID) VALUES (1, 6);


INSERT INTO STUDENT(ID, F_NAME, L_NAME, GPA) VALUES (1,'Bob','Bob',3.85);
INSERT INTO STUDENT(ID, F_NAME, L_NAME, GPA) VALUES (2,'John','John',3.9);
INSERT INTO STUDENT(ID, F_NAME, L_NAME, GPA) VALUES (3,'Charles','Charles',3.8);
INSERT INTO STUDENT(ID, F_NAME, L_NAME, GPA) VALUES (4,'Dean','Dean',3.9);


INSERT INTO COURSES  (id, COURSE_NAME) VALUES (111,'WAA');
INSERT INTO COURSES  (id, COURSE_NAME) VALUES (222,'DS');
INSERT INTO COURSES  (id, COURSE_NAME) VALUES (333,'DSA');


INSERT INTO COURSES_ROSTER (COURSES_ID, roster_id) VALUES (111,4);
INSERT INTO COURSES_ROSTER (COURSES_ID, roster_id) VALUES (222,1);
INSERT INTO COURSES_ROSTER (COURSES_ID, roster_id) VALUES (111,2);
INSERT INTO COURSES_ROSTER (COURSES_ID, roster_id) VALUES (333,3);

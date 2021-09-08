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
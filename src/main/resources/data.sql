-- Users
    INSERT INTO users (name) VALUES ('John Doe');
    INSERT INTO users (name) VALUES ('Jane Doe');
    INSERT INTO users (name) VALUES ('Alice');
    INSERT INTO users (name) VALUES ('Bob');
    INSERT INTO users (name) VALUES ('Tom');
    INSERT INTO users (name) VALUES ('Jerry');
    INSERT INTO users (name) VALUES ('Oscar');
    INSERT INTO users (name) VALUES ('Max');
    INSERT INTO users (name) VALUES ('Leo');
    INSERT INTO users (name) VALUES ('Alex');
    INSERT INTO users (name) VALUES ('Sophia');
    INSERT INTO users (name) VALUES ('Emma');
    INSERT INTO users (name) VALUES ('Olivia');
    INSERT INTO users (name) VALUES ('Ava');
    INSERT INTO users (name) VALUES ('Isabella');
    INSERT INTO users (name) VALUES ('Mia');
    INSERT INTO users (name) VALUES ('Zoe');
    INSERT INTO users (name) VALUES ('Lily');
    INSERT INTO users (name) VALUES ('Emily');

-- Posts
    -- looping 100 times and only increamenting the post title and content
    INSERT INTO post (title, content, author_id) VALUES ('Post 1', 'Content of Post 1', 1);
    INSERT INTO post (title, content, author_id) VALUES ('Post 2', 'Content of Post 2', 1);
    INSERT INTO post (title, content, author_id) VALUES ('Post 3', 'Content of Post 3', 1);
    INSERT INTO post (title, content, author_id) VALUES ('Post 4', 'Content of Post 4', 2);
    INSERT INTO post (title, content, author_id) VALUES ('Post 5', 'Content of Post 5', 2);
    INSERT INTO post (title, content, author_id) VALUES ('Post 6', 'Content of Post 6', 2);
    INSERT INTO post (title, content, author_id) VALUES ('Post 7', 'Content of Post 7', 3);
    INSERT INTO post (title, content, author_id) VALUES ('Post 8', 'Content of Post 8', 3);
    INSERT INTO post (title, content, author_id) VALUES ('Post 9', 'Content of Post 9', 3);
    INSERT INTO post (title, content, author_id) VALUES ('Post 10', 'Content of Post 10', 4);
    INSERT INTO post (title, content, author_id) VALUES ('Post 11', 'Content of Post 11', 4);
    INSERT INTO post (title, content, author_id) VALUES ('Post 12', 'Content of Post 12', 4);
    INSERT INTO post (title, content, author_id) VALUES ('Post 13', 'Content of Post 13', 5);
    INSERT INTO post (title, content, author_id) VALUES ('Post 14', 'Content of Post 14', 5);
    INSERT INTO post (title, content, author_id) VALUES ('Post 15', 'Content of Post 15', 5);
    INSERT INTO post (title, content, author_id) VALUES ('Post 16', 'Content of Post 16', 6);
    INSERT INTO post (title, content, author_id) VALUES ('Post 17', 'Content of Post 17', 6);
    INSERT INTO post (title, content, author_id) VALUES ('Post 18', 'Content of Post 18', 6);
    INSERT INTO post (title, content, author_id) VALUES ('Post 19', 'Content of Post 19', 7);
    INSERT INTO post (title, content, author_id) VALUES ('Post 20', 'Content of Post 20', 7);
    INSERT INTO post (title, content, author_id) VALUES ('Post 21', 'Content of Post 21', 7);
    INSERT INTO post (title, content, author_id) VALUES ('Post 22', 'Content of Post 22', 8);


-- -- PRODUCTS
--
-- INSERT INTO product (id, name, price, user_id)
-- VALUES (111, 'iPhone', 1200, 111);
--
-- INSERT INTO product (id, name, price, user_id)
-- VALUES (112, 'iPad', 900, 111);
--
-- INSERT INTO product (id, name, price, user_id)
-- VALUES (113, 'Speakers', 100, 111);
--
-- INSERT INTO product (id, name, price, user_id)
-- VALUES (114, 'SD Card', 50, 111);
--
-- INSERT INTO product (id, name, price, user_id)
-- VALUES (115, 'Fridge', 1500, 111);
--
-- INSERT INTO product (id, name, price, user_id)
-- VALUES (116, 'Smart TV', 1800, 111);
--
-- INSERT INTO product (id, name, price, user_id)
-- VALUES (117, 'MacBook', 1800, 111);
--
-- INSERT INTO product (id, name, price, user_id)
-- VALUES (118, 'Smart Watch', 320, 111);
--
-- INSERT INTO product (id, name, price, user_id)
-- VALUES (119, 'MacBook Air', 800, 111);
--
-- INSERT INTO product (id, name, price, user_id)
-- VALUES (120, 'iPad Pro', 1200, 111);
--
-- INSERT INTO product (id, name, price, user_id)
-- VALUES (121, 'Pen', 5, 112);
--
-- -- REVIEWS
--
-- INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
-- VALUES (1,'awesome phone',5,111);
--
-- INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
-- VALUES (2,'awesome !',5,111);
--
-- INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
-- VALUES (3,'it sucks',5,111);
--
-- INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
-- VALUES (4,'its great',4,111);
--
-- INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
-- VALUES (5,'awesome phone',4,111);
--
-- INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
-- VALUES (6,'amazing phone',3,111);
--
-- INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
-- VALUES (7,'awesome phone',5,111);
--
-- INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
-- VALUES (8,'amazing phone',4,111);
--
-- INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
-- VALUES (9,'awesome phone',5,111);
--
-- INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
-- VALUES (10,'amazing phone',5,111);
--
--
-- INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
-- VALUES (11,'awesome tablet',5,112);
--
--
-- -- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- -- VALUES (111,1);
-- -- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- -- VALUES (111,2);
-- -- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- -- VALUES (111,3);
-- -- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- -- VALUES (111,4);
-- -- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- -- VALUES (111,5);
-- -- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- -- VALUES (111,6);
-- -- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- -- VALUES (111,7);
-- -- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- -- VALUES (111,8);
-- -- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- -- VALUES (111,9);
-- -- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- -- VALUES (111,10);
-- -- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- -- VALUES (112,11);
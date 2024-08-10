CREATE TABLE IF NOT EXISTS products (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255),
    description VARCHAR(1000),
    price MONEY,
    quantity INTEGER
);
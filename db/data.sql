-- Insert default users
INSERT INTO users (username, password, role) VALUES
('admin', 'admin123', 'admin'),
('cashier', 'cashier123', 'cashier');

-- Insert default products
INSERT INTO products (name, price, stock) VALUES
('Cattle Feed', 25.00, 100),
('Chicken Feed', 15.00, 200),
('Goat Feed', 30.00, 50),
('Fish Feed', 20.00, 150);

-- Insert default sales (example)
INSERT INTO sales (user_id, total) VALUES
(1, 50.00),
(2, 30.00);

-- Insert default sale_items (example)
INSERT INTO sale_items (sale_id, product_id, quantity, price) VALUES
(1, 1, 2, 25.00),
(2, 2, 1, 15.00);

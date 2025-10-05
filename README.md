Primera api realizada de ctegoris y productos en java usando Spring, la bbdd mysql y JPA.

Para probar inserciones en la BBDD se probó con :
-- Insertar datos en la tabla 'categories'
INSERT INTO categories (name, description) VALUES
('Electrodomésticos', 'Productos electrónicos para el hogar, como electrodomésticos y dispositivos para facilitar las tareas diarias.'),
('Libros y Literatura', 'Libros de diversas categorías y géneros, así como artículos relacionados con la literatura y la lectura.'),
('Deportes y Aventuras', 'Artículos y equipos deportivos, ropa para actividades al aire libre y productos relacionados con deportes y aventuras.'),
('Salud y Bienestar', 'Productos y servicios relacionados con la salud, el bienestar personal, suplementos y artículos para un estilo de vida saludable.');

-- Insertar datos en la tabla 'products'
INSERT INTO products (name, description, price, category_id, status) VALUES
('TV Samsung 60 pulgadas', null, 1000.99, 1, 1),
('Licuadora Oster', null, 129.95, 1, 1),
('Harry Potter y la piedra filosofal', null, 10.99, 2, 1),
('IT', null, 15.95, 2, 1),
('Bicicleta montañera', null, 899.99, 3, 1),
('Tabla de Surf', null, 450, 3, 1),
('Pasta dental Colgate', null, 8.99, 4, 1);

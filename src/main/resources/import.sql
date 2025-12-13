SQL

-- 1. AMD (Fabrica Procesadores y Gráficas)
INSERT INTO marca (id_marca, nombre, activa) VALUES (1, 'AMD', true);
INSERT INTO marca_categorias (marca_id, categoria) VALUES (1, 'PROCESADOR');
INSERT INTO marca_categorias (marca_id, categoria) VALUES (1, 'GPU');

-- 2. Intel (Fabrica Procesadores)
INSERT INTO marca (id_marca, nombre, activa) VALUES (2, 'Intel', true);
INSERT INTO marca_categorias (marca_id, categoria) VALUES (2, 'PROCESADOR');

-- 3. Asus (Fabrica Motherboards, GPUs, Periféricos)
INSERT INTO marca (id_marca, nombre, activa) VALUES (3, 'Asus', true);
INSERT INTO marca_categorias (marca_id, categoria) VALUES (3, 'MOTHERBOARD');
INSERT INTO marca_categorias (marca_id, categoria) VALUES (3, 'GPU');

-- 4. Gigabyte (Fabrica Motherboards, GPUs)
INSERT INTO marca (id_marca, nombre, activa) VALUES (4, 'Gigabyte', true);
INSERT INTO marca_categorias (marca_id, categoria) VALUES (4, 'MOTHERBOARD');
INSERT INTO marca_categorias (marca_id, categoria) VALUES (4, 'GPU');

-- 5. MSI (Fabrica Motherboards, GPUs)
INSERT INTO marca (id_marca, nombre, activa) VALUES (5, 'MSI', true);
INSERT INTO marca_categorias (marca_id, categoria) VALUES (5, 'MOTHERBOARD');
INSERT INTO marca_categorias (marca_id, categoria) VALUES (5, 'GPU');
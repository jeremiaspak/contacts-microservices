DROP TABLE IF EXISTS contact CASCADE;

CREATE TABLE contact (
  id INT AUTO_INCREMENT PRIMARY KEY,
  user_id INT NOT NULL,
  name VARCHAR(150) NOT NULL,
  phone VARCHAR(20) NOT NULL
);

INSERT INTO contact (user_id, name, phone) VALUES
  (1, 'João', '+5511911223344'),
  (1, 'Ana', '+5511911223344'),
  (2, 'Maria', '+5511988776655');

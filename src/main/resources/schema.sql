DROP TABLE IF EXISTS cars;

CREATE TABLE cars (
    id INT AUTO_INCREMENT PRIMARY KEY,
    brand VARCHAR(100) NOT NULL,
    modelyear INT NOT NULL,
    type VARCHAR(100) NOT NULL,
    colour VARCHAR(50) NOT NULL,
    licenseplate VARCHAR(50) NOT NULL,
    img VARCHAR(255)
);

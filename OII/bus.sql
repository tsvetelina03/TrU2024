CREATE TABLE Users (
    userID INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL,
    firstname VARCHAR(50) NOT NULL,
    secondName VARCHAR(50),
    lastName VARCHAR(50) NOT NULL,
    phoneNumber VARCHAR(15),
    businessclubMembership BOOLEAN DEFAULT FALSE,
    cyberclubMembership BOOLEAN DEFAULT FALSE,
    registrationDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    roles ENUM('admin', 'user') DEFAULT 'user'
);

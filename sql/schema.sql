-- Electrical Appliance Tracking & Maintenance System Schema (MySQL)

CREATE TABLE site (
    site_id INT AUTO_INCREMENT PRIMARY KEY,
    site_name VARCHAR(100) NOT NULL,
    site_address VARCHAR(255)
);

CREATE TABLE floor (
    floor_id INT AUTO_INCREMENT PRIMARY KEY,
    floor_name VARCHAR(50) NOT NULL,
    site_id INT,
    FOREIGN KEY (site_id) REFERENCES site(site_id)
);

CREATE TABLE room (
    room_id INT AUTO_INCREMENT PRIMARY KEY,
    room_name VARCHAR(50) NOT NULL,
    floor_id INT,
    FOREIGN KEY (floor_id) REFERENCES floor(floor_id)
);

CREATE TABLE category (
    category_id INT AUTO_INCREMENT PRIMARY KEY,
    category_name VARCHAR(50) NOT NULL
);

CREATE TABLE type (
    type_id INT AUTO_INCREMENT PRIMARY KEY,
    type_name VARCHAR(50) NOT NULL,
    category_id INT,
    FOREIGN KEY (category_id) REFERENCES category(category_id)
);

CREATE TABLE subtype (
    subtype_id INT AUTO_INCREMENT PRIMARY KEY,
    subtype_name VARCHAR(50) NOT NULL,
    type_id INT,
    FOREIGN KEY (type_id) REFERENCES type(type_id)
);

CREATE TABLE vendor (
    vendor_id INT AUTO_INCREMENT PRIMARY KEY,
    vendor_name VARCHAR(100) NOT NULL,
    vendor_contact VARCHAR(100)
);

CREATE TABLE asset (
    asset_id INT AUTO_INCREMENT PRIMARY KEY,
    asset_name VARCHAR(100) NOT NULL,
    room_id INT,
    subtype_id INT,
    vendor_id INT,
    warranty_start_date DATE,
    warranty_end_date DATE,
    warranty_amount DECIMAL(10,2),
    warranty_document_path VARCHAR(255),
    purchase_date DATE,
    cost DECIMAL(10,2),
    FOREIGN KEY (room_id) REFERENCES room(room_id),
    FOREIGN KEY (subtype_id) REFERENCES subtype(subtype_id),
    FOREIGN KEY (vendor_id) REFERENCES vendor(vendor_id)
);

CREATE TABLE worker (
    worker_id INT AUTO_INCREMENT PRIMARY KEY,
    worker_name VARCHAR(100) NOT NULL,
    worker_contact VARCHAR(100)
);

CREATE TABLE scheduled_task (
    schedule_id INT AUTO_INCREMENT PRIMARY KEY,
    asset_id INT,
    description TEXT NOT NULL,
    scheduled_date DATE NOT NULL,
    room_id INT,
    assigned_worker_id INT,
    status VARCHAR(20) NOT NULL,
    FOREIGN KEY (asset_id) REFERENCES asset(asset_id),
    FOREIGN KEY (room_id) REFERENCES room(room_id),
    FOREIGN KEY (assigned_worker_id) REFERENCES worker(worker_id)
);

CREATE TABLE servicing_log (
    log_id INT AUTO_INCREMENT PRIMARY KEY,
    asset_id INT,
    room_id INT,
    worker_id INT,
    schedule_id INT,
    description TEXT NOT NULL,
    service_date DATE NOT NULL,
    cost DECIMAL(10,2),
    document_path VARCHAR(255),
    FOREIGN KEY (asset_id) REFERENCES asset(asset_id),
    FOREIGN KEY (room_id) REFERENCES room(room_id),
    FOREIGN KEY (worker_id) REFERENCES worker(worker_id),
    FOREIGN KEY (schedule_id) REFERENCES scheduled_task(schedule_id)
);


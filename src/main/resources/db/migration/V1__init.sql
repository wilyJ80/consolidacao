CREATE TABLE demographics (
   id INTEGER PRIMARY KEY,
   label VARCHAR(32) NOT NULL UNIQUE
);

CREATE TABLE contact (
   id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
   phone_number VARCHAR(11) NOT NULL,
   name VARCHAR(32),
   neighborhood VARCHAR(32),
   contacted BOOLEAN DEFAULT false,
   demographics_id INTEGER,
   FOREIGN KEY (demographics_id) REFERENCES demographics (id)
);

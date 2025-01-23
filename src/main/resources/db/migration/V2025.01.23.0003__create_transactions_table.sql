CREATE TABLE transactions (

    id INTEGER PRIMARY KEY,


    customer_id uuid not null references customers(id),
    product_id varchar(255) not null references products(id),

    amount numeric(15,0) not null,
    status integer,
    transaction_date TIMESTAMPTZ NOT NULL,
    create_by varchar(255) not null,
    
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW()
);
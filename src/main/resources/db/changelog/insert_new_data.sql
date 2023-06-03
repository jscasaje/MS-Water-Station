--liquibase formatted sql
--changeset neji:3

UPDATE account SET age = 29 where account_name='neji';

--changeset neji:4
UPDATE account SET age = 30 where account_name='neji';




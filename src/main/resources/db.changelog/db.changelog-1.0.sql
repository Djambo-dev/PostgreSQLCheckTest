--liquibase formatted sql

--changeset dzhamil.sadykov:test_1

CREATE TYPE CAT_TYPE AS ENUM ('BIG_FURRY', 'SMALL_RED');

CREATE TABLE CATENTITY
(
    ID      BIGINT,
    NAME    TEXT,
    CATTYPE CAT_TYPE,
        CONSTRAINT CATENTITY_PK PRIMARY KEY (ID)
);
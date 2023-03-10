DROP TABLE IF EXISTS 'PARTICIPANTE';
CREATE TABLE 'PARTICIPANTE'(
    'ID_PARTICIPANTE' NUMBER NOT NULL AUTOINCREMENT,
    'PARTICIPANTE_NOME' VARCHAR(100) NOT NULL,
    'PARTICIPANTE_EMAIL' VARCHAR(100) NOT NULL,
    'PARTICIPANTE_TELEFONE' NUMBER NOT NULL,
);

DROP TABLE IF EXISTS 'CERTIFICADO';
CREATE TABLE 'PARTICIPANTE'(
    'ID_CERTIFICADO' NUMBER NOT NULL AUTOINCREMENT,
    'CERTIFICADO_NOME' VARCHAR(100) NOT NULL,
    'CERTIFICADO_DATA' NUMBER NOT NULL,
    'CERTIFICADO_TIPO' VARCHAR(100) NOT NULL,
);

DROP TABLE IF EXISTS 'EVENTO';
CREATE TABLE 'EVENTO'(
    'ID_EVENTO' NUMBER NOT NULL AUTOINCREMENT,
    'EVENTO_NOME' VARCHAR(100) NOT NULL,
    'EVENTO_DATA' NUMBER NOT NULL,
    'EVENTO_LOCAL' VARCHAR(100) NOT NULL,
);

DROP TABLE IF EXISTS 'PARTICIPACAO_EM_EVENTO';
CREATE TABLE 'PARTICIPACAO_EM_EVENTO'(
    'ID_PARTICIPANTE' NUMBER NOT NULL,
    'ID_EVENTO' NUMBER NOT NULL,
    'PARTICIPACAO_DATA' NUMBER NOT NULL,
);

DROP TABLE IF EXISTS 'ORGANIZADOR';
CREATE TABLE 'ORGANIZADOR'(
    'ID_ORGANIZADOR' NUMBER NOT NULL AUTOINCREMENT,
    'ORGANIZADOR_NOME' VARCHAR(100) NOT NULL,
    'ORGANIZADOR_EMAIL' VARCHAR(100) NOT NULL,
    'ORGANIZADOR_TELEFONE' NUMBER NOT NULL,
);

DROP TABLE IF EXISTS 'EVENTO_FUT_PASS';
CREATE TABLE 'EVENTO_FUT_PASS'(
    'ID_EVENTO' NUMBER NOT NULL AUTOINCREMENT,
    'EVENTO_NOME' VARCHAR(100) NOT NULL,
    'EVENTO_DATA' VARCHAR(100) NOT NULL,
    'EVENTO_LOCAL' VARCHAR(100) NOT NULL,
    'EVENTO_STATUS' VARCHAR(100) NOT NULL,
);
INSERT INTO tb_endereco (cidade, bairro, uf, endereco, numero, complemento, cep) VALUES ('Brasília', 'Samambaia Sul', 'DF', 'Quadra 303', '202', 'Apartamento', '01234-567');
INSERT INTO tb_endereco (cidade, bairro, uf, endereco, numero, complemento, cep) VALUES ('Brasília', 'Recanto das Emas', 'DF', 'Quadra 202', '22', 'Casa', '44444-122');
INSERT INTO tb_endereco (cidade, bairro, uf, endereco, numero, complemento, cep) VALUES ('Brasília', 'Taguatinga Norte', 'DF', 'QNM', '403', 'Apartamento', '65482-554');

INSERT INTO tb_cliente (nome, nascimento, telefone, cpf, cnpj, email, observacao, endereco_id) VALUES ('João Silva', '1990-01-01', '61994784584', '11111111111', NULL, 'joao@example.com', 'Cliente VIP', 1);
INSERT INTO tb_cliente (nome, nascimento, telefone, cpf, cnpj, email, observacao, endereco_id) VALUES ('Joana Gomes', '1986-04-11', '61983457522', '55555555555', 99999999111111, 'joana@example.com', 'Cliente VIP', 3);
INSERT INTO tb_cliente (nome, nascimento, telefone, cpf, cnpj, email, observacao, endereco_id) VALUES ('Bianca Lopes', '1999-11-22', '61998112457', '44444444444', NULL, 'bianca@example.com', 'Cliente VIP', 2);
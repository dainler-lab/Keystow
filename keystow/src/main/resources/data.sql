INSERT INTO cartoes(ano_do_vencimento, bandeira, codigo_de_seguranca, mes_do_vencimento, numero, titular_do_cartao)
VALUES ('2025', 'visa', '234', '12', '1234123412341234', 'Joao da Silva');

INSERT INTO credenciais(campo_de_usuario, senha, uri)
VALUES ('administrador@gmail.com', 'senha@pass', 'google.com');

INSERT INTO credenciais(campo_de_usuario, senha, uri)
VALUES ('administrador@email.com', 'senha@pass', 'email.com');

INSERT INTO itens(nome,tipo, data_da_operacao, favorito, lixeira, credencial_id)
VALUES('Admin','CREDENCIAL', '2019-05-05 18:00:00', null, null, 1);

INSERT INTO itens(nome,tipo, data_da_operacao, favorito, lixeira, credencial_id)
VALUES('Root','CREDENCIAL', '2019-05-05 18:00:00', null, null, 2);
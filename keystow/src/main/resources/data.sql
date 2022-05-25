INSERT INTO itens(nome,tipo, data_da_operacao, favorito, lixeira)
VALUES('Ana','CREDENCIAL', '2019-05-05 18:00:00', false, false);

INSERT INTO itens(nome,tipo, data_da_operacao, favorito, lixeira)
VALUES('Bruna','CREDENCIAL', '2019-05-05 18:00:00', false, false);

INSERT INTO credenciais(campo_de_usuario, senha, uri)
VALUES ('ana@gmail.com', 'senha@pass', 'google.com');

INSERT INTO credenciais(campo_de_usuario, senha, uri)
VALUES ('bruna@outlook.com', 'senha@pass', 'microsoft.com');

UPDATE itens SET credencial_id = 1 WHERE id = 1;
UPDATE credenciais SET item_id = 1 WHERE id = 1;

UPDATE itens SET credencial_id = 2 WHERE id = 2;
UPDATE credenciais SET item_id = 2 WHERE id = 2;

INSERT INTO cartoes(ano_do_vencimento, bandeira, codigo_de_seguranca, mes_do_vencimento, numero, titular_do_cartao, item_id)
VALUES ('2025', 'visa', '234', '12', '1234123412341234', 'Ana', 1);
UPDATE itens SET cartao_id = 1 WHERE id = 1;



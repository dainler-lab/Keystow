INSERT INTO credenciais(campo_de_usuario, senha, uri)
VALUES ('administrador@gmail.com', 'senha@pass', 'google.com')

INSERT INTO credenciais(campo_de_usuario, senha, uri)
VALUES ('administrador@email.com', 'senha@pass', 'email.com')

INSERT INTO itens(nome,tipo, data_da_operação, favorito, lixeira, credencial_id)
VALUES('Admin','credencial', '2019-05-05 18:00:00', null, null, 1)

INSERT INTO itens(nome,tipo, data_da_operação, favorito, lixeira, credencial_id)
VALUES('Root','credencial', '2019-05-05 18:00:00', null, null, 2)
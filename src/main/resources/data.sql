insert into tipo_sugestao (descricao) values 
('Comentário'),
('Crítica'),
('Elogio'),
('Sugestão');

insert into curso (nome)
values
('Sistemas para Internet'),
('Desenvolvimento Multiplataforma'),
('Administração');

insert into sugestao (autor, conteudo, data, id_curso, id_tiposugestao)
values
('Andre Silva', 'Eu odeio programação. Eu odeio programação. Eu odeio programação. Eu odeio programação. Funcionou! Eu amo programação', now(), 1, 4),
('Antonia Medeiros', 'Eu gosto de prgramar... O Front End!' , now(), 1, 1),
('José Silva', 'Gostei muito das aulas Flutter, ele deveria ter sido inventado muito antes!. ', now(), 2, 3),
('Enzo Silva', 'Vamos criar um Discord para compartilhar conteúdo, experiências e conhecimentos sobre desenvolvimento?', now(), 2, 2);

insert into disciplina (nome) values 
('Tópicos I'),
('Tópicos II'),
('Tópicos III'),
('Desenvolvimento para Dispositivos Móveis I'),
('Desenvolvimento para Dispositivos Móveis II'),
('Desenvolvimento para Servidores II');

insert into curso_disciplina (id_curso, id_disciplina) values
(1,1),
(1,2),
(1,3),
(2,4),
(2,5),
(2,5);
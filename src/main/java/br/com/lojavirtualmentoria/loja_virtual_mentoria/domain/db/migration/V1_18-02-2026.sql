select constraint_name from information_schema.constraint_column_usage
where table_name = 'usuario_acesso' and column_name = 'id_acesso'
and constraint_name <> 'unique_acesso_user' and constraint_name <> 'usuario_acesso_id_acesso_not_null';

alter table usuario_acesso drop constraint "uk4664573x50o7fa5quyvp6mck9"
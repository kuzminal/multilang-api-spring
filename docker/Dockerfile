FROM postgres:16.1
COPY ./init/01-init.sql /docker-entrypoint-initdb.d/
COPY ./init/02-demo-small-20170815.sql /docker-entrypoint-initdb.d/
package com.gestor.Topicos.domain.topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    @Query("""
            select t from Topico t 
            where t.status = ACTIVO 
            order by t.fechaCreacion ASC
            """)
    Page<Topico> findByStatusActivo(Pageable paginacion);
}

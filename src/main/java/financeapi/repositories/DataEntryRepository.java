package financeapi.repositories;

import financeapi.models.DataEntryModel_Impl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DataEntryRepository extends JpaRepository<DataEntryModel_Impl, Long> {
}

package ma.meriem.ebanking.repositories;

import ma.meriem.ebanking.entites.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepo extends JpaRepository<BankAccount,String> {
    
}

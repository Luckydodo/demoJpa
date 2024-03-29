package footmark.springdata.jpa.dao;

import footmark.springdata.jpa.domain.AccountInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Author:ZhangJianPing  Time:11-9-4,下午8:50
 */
public interface UserDao extends Repository<AccountInfo, Long> {

    public AccountInfo save(AccountInfo accountInfo);

    public AccountInfo findByAccountId(Long accountId);

    public Page<AccountInfo> findByBalanceGreaterThan(Integer balance, Pageable pageable);

    List<AccountInfo> findAll();
}

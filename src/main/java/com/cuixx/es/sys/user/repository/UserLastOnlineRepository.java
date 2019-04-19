package com.cuixx.es.sys.user.repository;

import com.cuixx.es.common.repository.BaseRepository;
import com.cuixx.es.sys.user.entity.UserLastOnline;

public interface UserLastOnlineRepository extends BaseRepository<UserLastOnline, Long> {

    UserLastOnline findByUserId(Long userId);
}

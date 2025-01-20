package dev.study.정적팩토리.caching;

import java.util.HashMap;
import java.util.Map;

/**
 *  객체 캐싱 구현
 *  - 동일한 입력값으로 동일한 객체를 반환하여 메모리 사용을 최적화 한다.
 *  - 이미 생성된 객체는 저장소(Map)에서 가져오고, 새로 생성해야 할 경우에 저장소에 추가
 */
public class ConnectionPool {
    private static final Map<String, ConnectionPool> cache = new HashMap<>();
    private final String connectionName;

    private ConnectionPool(String connectionName) {
        this.connectionName = connectionName;
    }

    // 정적 팩토리 메서드
    public static ConnectionPool getInstance(String connectionName) {
        return cache.computeIfAbsent(connectionName, ConnectionPool::new);
    }

    @Override
    public String toString() {
        return "ConnectionPool{" +
                "connectionName='" + connectionName + '\'' +
                '}';
    }
}

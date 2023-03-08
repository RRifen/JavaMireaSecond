package Prac3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockMap<K, V> implements Map<K, V>{
    private final Map<K, V> map;
    
    private final Lock lock = new ReentrantLock();

    public LockMap() {
        map = new HashMap<>();
    }


    @Override
    public int size() {
        lock.lock();
        int size = map.size();
        lock.unlock();
        return size;
    }

    @Override
    public boolean isEmpty() {
        lock.lock();
        boolean result = map.isEmpty();
        lock.unlock();
        return result;
    }

    @Override
    public boolean containsKey(Object key) {
        lock.lock();
        boolean result = map.containsKey(key);
        lock.unlock();
        return result;
    }

    @Override
    public boolean containsValue(Object value) {
        lock.lock();
        boolean result = map.containsValue(value);
        lock.unlock();
        return result;
    }

    @Override
    public V get(Object key) {
        lock.lock();
        V result =  map.get(key);
        lock.unlock();
        return result;
    }

    @Override
    public V put(K key, V value) {
        lock.lock();
        V result = map.put(key, value);
        lock.unlock();
        return result;
    }

    @Override
    public V remove(Object key) {
        lock.lock();
        V result = map.remove(key);
        lock.unlock();
        return result;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        lock.lock();
        map.putAll(m);
        lock.unlock();
    }

    @Override
    public void clear() {
        lock.lock();
        map.clear();
        lock.unlock();
    }

    @Override
    public Set<K> keySet() {
        lock.lock();
        Set<K> result = map.keySet();
        lock.unlock();
        return result;
    }

    @Override
    public Collection<V> values() {
        lock.lock();
        Collection<V> result =  map.values();
        lock.unlock();
        return result;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        lock.lock();
        var result = map.entrySet();
        lock.unlock();
        return result;
    }
}

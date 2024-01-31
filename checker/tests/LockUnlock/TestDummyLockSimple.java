// a simple test case that checks that a Lock object is unlocked()
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

class TestDummyLockSimple {
  static class DummyLock implements Lock {
    @Override
    public void unlock() {}

    @Override
    public void lock() {}

    @Override
    public boolean tryLock() {
      return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) {
      return false;
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {}

    @Override
    public Condition newCondition() {
      throw new UnsupportedOperationException("newCondition() not supported");
    }
  }

  static void test() {
    DummyLock l = new DummyLock();
    l.unlock();
    ReentrantLock rl = new ReentrantLock();
    rl.unlock();
  }
}

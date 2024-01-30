import java.util.concurrent.locks.*;

class LockUnlockDifferentMethodTest {
  static void lockObject(Lock t) {
    t.lock();
  }

  static void unlockObject(Lock t) {
    t.unlock();
  }

  static void test() {
    Lock testLock = new ReentrantLock();
    try {
      lockObject(testLock);
      //      testLock.lock();
    } finally {
      //      unlockObject(testLock);
    }
  }
}

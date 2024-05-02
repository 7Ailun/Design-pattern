package org.wei.design.single.lazyman;

    /**
     * 使用 静态内部类
     */
    public class SingleLazyMan4 {

        private SingleLazyMan4() {
        }

        static class SingleLazyManInner {
            private static SingleLazyMan4 singleLazyMan4 = new SingleLazyMan4();

            private SingleLazyManInner() {
            }

        }

        public static SingleLazyMan4 getInstance() {
            return SingleLazyManInner.singleLazyMan4;
        }
    }

package hu.bme.mit.train.controller;

import com.google.common.collect.Table;
import hu.bme.mit.train.interfaces.TrainController;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class TachoGraph extends TrainControllerImpl {

    public Table<Integer, Integer, Integer> tachoGraph = new Table<Integer, Integer, Integer>() {
        @Override
        public boolean contains(Object rowKey, Object columnKey) {
            return false;
        }

        @Override
        public boolean containsRow(Object rowKey) {
            return false;
        }

        @Override
        public boolean containsColumn(Object columnKey) {
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        @Override
        public Integer get(Object rowKey, Object columnKey) {
            return null;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public void clear() {

        }

        @Override
        public Integer put(Integer rowKey, Integer columnKey, Integer value) {
            return null;
        }

        @Override
        public void putAll(Table<? extends Integer, ? extends Integer, ? extends Integer> table) {

        }

        @Override
        public Integer remove(Object rowKey, Object columnKey) {
            return null;
        }

        @Override
        public Map<Integer, Integer> row(Integer rowKey) {
            return null;
        }

        @Override
        public Map<Integer, Integer> column(Integer columnKey) {
            return null;
        }

        @Override
        public Set<Cell<Integer, Integer, Integer>> cellSet() {
            return null;
        }

        @Override
        public Set<Integer> rowKeySet() {
            return null;
        }

        @Override
        public Set<Integer> columnKeySet() {
            return null;
        }

        @Override
        public Collection<Integer> values() {
            return null;
        }

        @Override
        public Map<Integer, Map<Integer, Integer>> rowMap() {
            return null;
        }

        @Override
        public Map<Integer, Map<Integer, Integer>> columnMap() {
            return null;
        }
    };

    public TachoGraph(Integer currentTime, Integer joystickPos, Integer refSpeed)
    {
        this.tachoGraph.put(currentTime, joystickPos, refSpeed);
    }

    public boolean empty() {
        return tachoGraph.isEmpty();
    }

}

package lap3_3;
import junit.framework.TestCase;

public class WeatherRecordTest extends TestCase {
	public void testWithinRange() {
		Date date = new Date(15, 10, 2025);
        TemperatureRange today = new TemperatureRange(24, 33);
        TemperatureRange normal = new TemperatureRange(23, 31);
        TemperatureRange record = new TemperatureRange(20, 36);
        WeatherRecord w = new WeatherRecord(date, today, normal, record, 10.5);
        TemperatureRange today2 = new TemperatureRange(24, 31);
        WeatherRecord w2 = new WeatherRecord(date, today2, normal, record, 10.5);
        assertFalse(w.withinRange());
        assertTrue(w2.withinRange());
	}
        public void testRainyDay() {
        	Date date = new Date(15, 10, 2025);
            TemperatureRange today = new TemperatureRange(24, 33);
            TemperatureRange normal = new TemperatureRange(23, 31);
            TemperatureRange record = new TemperatureRange(20, 36);
            WeatherRecord w = new WeatherRecord(date, today, normal, record, 10.5);
            assertTrue(w.rainyDay(10.0));
            assertFalse(w.rainyDay(11.0));
        }
        public void testRecorDay() {
        	Date date = new Date(15, 10, 2025);
            TemperatureRange today = new TemperatureRange(19, 37);
            TemperatureRange normal = new TemperatureRange(23, 31);
            TemperatureRange record = new TemperatureRange(20, 36);
            WeatherRecord w = new WeatherRecord(date, today, normal, record, 10.5);
            assertTrue(w.recordDay());
            TemperatureRange today2 = new TemperatureRange(21, 35);
            TemperatureRange record2 = new TemperatureRange(20, 36);
            WeatherRecord w2 = new WeatherRecord(date, today2, normal, record2, 10.5);
            assertFalse(w2.recordDay());
            
        }
	}



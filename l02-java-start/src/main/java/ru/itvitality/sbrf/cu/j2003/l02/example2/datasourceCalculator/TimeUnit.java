package ru.itvitality.sbrf.cu.j2003.l02.example2.datasourceCalculator;

public enum TimeUnit {
    MILLISECOND("ms", 1L),
    SECOND("s", 1000L),
    MINUTE("mi", 60*1000L);

    private String key;
    private Long duration;

    TimeUnit( String key, Long duration ) {
        this.key = key;
        this.duration = duration;
    }

    public static TimeUnit forKey(String key){
        if (key == null || key.isEmpty()){
            return null;
        }
        for (TimeUnit tu: values()){
            if (tu.key.equalsIgnoreCase( key )){
                return tu;
            }
        }
        return null;
    }

    public String getKey() {
        return key;
    }

    public Long getDuration() {
        return duration;
    }
}

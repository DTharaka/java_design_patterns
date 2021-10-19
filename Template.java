class Template {
    public static void main(String args[]) {
        Excel e = new Excel();
        e.readProcessSave();

        File f = new File();
        f.readProcessSave();
    }
}

/*
 * 
 * this.readData(); this.processData(); this.SaveData();
 */

abstract class DataProcesser {
    protected void readProcessSave() {
        readData();
        processData();
        SaveData();
    }

    protected abstract void readData();

    protected abstract void processData();

    private void SaveData() {
        System.out.println("Save Data to DB");
    }
}

class Excel extends DataProcesser {
    protected void readData() {
        System.out.println("read excel data");
    }

    protected void processData() {
        System.out.println("process excel data");
    }
}

class File extends DataProcesser {

    @Override
    protected void readData() {
        System.out.println("read file data");

    }

    @Override
    protected void processData() {
        System.out.println("process file data");

    }

}
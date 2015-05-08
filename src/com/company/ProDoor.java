class ProDoor {
    public int height;
    public int width;
    public boolean locked;
    public boolean opened;
    public ProDoor(int h, int w, boolean opened, boolean locked) {
        this.height = h;
        this.width = w;
        this.opened = opened;
        this.locked = locked;
    }
    public String toString() {
        String o;
        String l;
        if (opened) {
            o = "yes";
        } else {
            o = "no";
        }
        if (locked) {
            l = "yes";
        } else {
            l = "no";
        }
        return "Size: " + height + "x" + width + " mm" + "\nOpened: " + o + "\nLocked: " + l;
    }
    public void lock() {
        locked = true;
    }
    public void unlock() {
        locked = false;
    }
    public void close() {
        if (locked && opened) {
            System.out.println("Lock is in the way. Cannot close!");
        } else {
            opened = false;
        }
    }
    public void open() {
        if (locked && !opened) {
            System.out.println("Door is locked. Cannot open!");
        } else {
            opened = true;
        }
    }
    public boolean isLocked() {
        return locked;
    }
    public boolean isClosed() {
        return !opened;
    }
}

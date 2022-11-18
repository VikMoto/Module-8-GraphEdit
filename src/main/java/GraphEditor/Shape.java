package GraphEditor;

class Shape implements ShapeInfo,DrawTool,ScaleableDrawable,Borderable{
    @Override
    public void name() {
        System.out.println("Shape.getClass() = " + this.getClass().getSimpleName());
    }

    @Override
    public double getBorderWidth() {
        return 0;
    }

    @Override
    public double getBorderColor() {
        return 0;
    }

    @Override
    public void getPencil() {

    }

    @Override
    public void getBrush() {

    }

    @Override
    public void getShapeTool() {

    }

    @Override
    public void getZoomTool() {

    }

    @Override
    public void getCropTool() {

    }

    @Override
    public void getArtisticMediaTool() {

    }

    @Override
    public void getTrancperencyTool() {

    }

    @Override
    public void getColorEyeDropper() {

    }

    @Override
    public void FillTool() {

    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public void Undo() {

    }

    @Override
    public void Redo() {

    }

    @Override
    public void Repeat() {

    }

    @Override
    public void Cut() {

    }

    @Override
    public void Copy() {

    }

    @Override
    public void Paaste() {

    }

    @Override
    public void SelectAll() {

    }

    @Override
    public void FindAndReplace() {

    }

    @Override
    public void ThreeDEffects() {

    }

    @Override
    public void Tabs() {

    }

    @Override
    public void Adjust() {

    }

    @Override
    public void Blur() {

    }

    @Override
    public void Cameras() {

    }

    @Override
    public void ColorTransform() {

    }

    @Override
    public void Correction() {

    }

    @Override
    public void Creative() {

    }

    @Override
    public void Custom() {

    }

    @Override
    public void Distort() {

    }

    @Override
    public void Noise() {

    }

    @Override
    public void Sharpen() {

    }

    @Override
    public void Texture() {

    }

    @Override
    public void Transform() {

    }

    @Override
    public void ArtisticMedia() {

    }

    @Override
    public void Bevel() {

    }

    @Override
    public void Blend() {

    }

    @Override
    public void Contour() {

    }

    @Override
    public void Envelope() {

    }

    @Override
    public void Extrude() {

    }

    @Override
    public void Lense() {

    }

    @Override
    public void New() {

    }

    @Override
    public void Save() {

    }

    @Override
    public void Load() {

    }

    @Override
    public void Close() {

    }

    @Override
    public void Import() {

    }

    @Override
    public void Export() {

    }

    @Override
    public void sendTo() {

    }

    @Override
    public void Print() {

    }

    @Override
    public void DocumentProperties() {

    }

    @Override
    public void Exit() {

    }

    @Override
    public void IncertPage() {

    }

    @Override
    public void DuplicatePage() {

    }

    @Override
    public void RenamePage() {

    }

    @Override
    public void PageNumberSettings() {

    }

    @Override
    public void DocumentPages() {

    }

    @Override
    public void PageSize() {

    }

    @Override
    public void Createl() {

    }

    @Override
    public void Insert() {

    }

    @Override
    public void CopyEffect() {

    }

    @Override
    public void CloneEffect() {

    }

    @Override
    public void Order() {

    }

    @Override
    public void Groupe() {

    }

    @Override
    public void Hide() {

    }

    @Override
    public void Lock() {

    }

    @Override
    public void JoinCurves() {

    }

    @Override
    public void Properties() {

    }

    @Override
    public void Objects() {

    }

    @Override
    public double getScale() {
        return 0;
    }

    @Override
    public void editSurface() {

    }

    @Override
    public void Normal() {

    }

    @Override
    public void FullScreen() {

    }

    @Override
    public void ZoomIn() {

    }

    @Override
    public void ZoomOut() {

    }

    @Override
    public void Page() {

    }

    @Override
    public void GuideLines() {

    }

    @Override
    public void AligmentGuides() {

    }
}

class Circle extends Shape {
    private final int radius;

    public int getRadius() {
        System.out.println("radius = " + radius);
        return radius;
    }
    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public void name() {
        System.out.println("Коло = " + this.getClass().getSimpleName());
    }
}

class IsoscelesTriangle extends Shape {

    @Override
    public void name() {
        System.out.println("Рівнобедрений трикутник = " + this.getClass().getSimpleName());
    }
}

class Rectangle extends Shape {

    @Override
    public void name() {
        System.out.println("Прямокутник = " + this.getClass().getSimpleName());
    }
}

class Quad extends Shape {

    @Override
    public void name() {
        System.out.println("Квадрат = " + this.getClass().getSimpleName());
    }
}

class Polygon extends Shape {

    @Override
    public void name() {
        System.out.println("Багатокутник = " + this.getClass().getSimpleName());
    }
}


class NameShape {
    private Shape shape;
    public NameShape(Shape shape) {
        this.shape = shape;
    }

    public void PrintName() {
        System.out.println("shape = " + shape.getClass().getSimpleName());
    }

}

class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle(5);
        Shape isoscelesTriangle = new IsoscelesTriangle();
        Shape rectangle = new Rectangle();
        Shape quad = new Quad();
        Shape polygon = new Polygon();

        shape.name();
        circle.name();
        circle.getRadius();
        isoscelesTriangle.name();
        rectangle.name();
        quad.name();
        polygon.name();

        new NameShape(circle).PrintName();
        new NameShape(isoscelesTriangle).PrintName();
        new NameShape(polygon).PrintName();
    }
}


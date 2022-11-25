import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GalleriaServiceComponent } from './galleria-service.component';

describe('GalleriaServiceComponent', () => {
  let component: GalleriaServiceComponent;
  let fixture: ComponentFixture<GalleriaServiceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GalleriaServiceComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GalleriaServiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

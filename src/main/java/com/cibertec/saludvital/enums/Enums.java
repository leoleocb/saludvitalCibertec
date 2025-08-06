package com.cibertec.saludvital.enums;

/**
 * Clase que agrupa todos los Enums usados en el sistema Salud Vital
 */
public class Enums {

    // Estado de la cita
    public enum EstadoCita {
        PROGRAMADA,
        CANCELADA,
        REALIZADA
    }

    // Especialidades de médicos
    public enum EspecialidadMedico {
        MEDICINA_GENERAL,
        PEDIATRIA,
        CARDIOLOGIA,
        DERMATOLOGIA,
        GINECOLOGIA,
        NEUROLOGIA
    }

    // Horario de atención del médico
    public enum HorarioAtencion {
        MANIANA,   // 8:00 a 12:00
        TARDE      // 13:00 a 17:00
    }

    // Frecuencia de administración de medicamentos
    public enum FrecuenciaMedicamento {
        UNA_VEZ_AL_DIA,
        DOS_VECES_AL_DIA,
        TRES_VECES_AL_DIA,
        CADA_8_HORAS,
        CADA_12_HORAS
    }
}
